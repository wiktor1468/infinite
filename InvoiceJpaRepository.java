

public class InvoiceJpaRepository implements InvoiceRepository {

    @Override
    @Cacheable(value = "invoices", key = "#invoiceNumber")
    public Invoice find(final String invoiceNumber) {
        return entityManager.createQuery("SELECT i FROM Invoice i WHERE i.invoiceNumber = :invoiceNumber", Invoice.class)
                .setParameter("invoiceNumber", invoiceNumber)
                .getSingleResult();

    }
}

