import javax.persistence.Entity;
@Entity
public class Invoice {
    private String invoiceNumber;
    private Object invoiceData;
//... constructor, getters, setters
    protected Invoice() {
    }


    public Invoice(String invoiceNumber, Object invoiceData) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceData = invoiceData;
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public Object getInvoiceData() {
        return invoiceData;
    }
    public void setInvoiceData(Object invoiceData) {
        this.invoiceData = invoiceData;
    }


}
