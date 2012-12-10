
package com.maki.toni;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.maki.toni package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Account_QNAME = new QName("http://toni.wst.com/", "account");
    private final static QName _CreateAccountResponse_QNAME = new QName("http://toni.wst.com/", "createAccountResponse");
    private final static QName _WithdrawResponse_QNAME = new QName("http://toni.wst.com/", "withdrawResponse");
    private final static QName _GetAccountInformationResponse_QNAME = new QName("http://toni.wst.com/", "getAccountInformationResponse");
    private final static QName _GetAccountInformation_QNAME = new QName("http://toni.wst.com/", "getAccountInformation");
    private final static QName _Transfer_QNAME = new QName("http://toni.wst.com/", "transfer");
    private final static QName _TransferResponse_QNAME = new QName("http://toni.wst.com/", "transferResponse");
    private final static QName _Deposit_QNAME = new QName("http://toni.wst.com/", "deposit");
    private final static QName _DepositResponse_QNAME = new QName("http://toni.wst.com/", "depositResponse");
    private final static QName _CreateAccount_QNAME = new QName("http://toni.wst.com/", "createAccount");
    private final static QName _Withdraw_QNAME = new QName("http://toni.wst.com/", "withdraw");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.maki.toni
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link GetAccountInformationResponse }
     * 
     */
    public GetAccountInformationResponse createGetAccountInformationResponse() {
        return new GetAccountInformationResponse();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link GetAccountInformation }
     * 
     */
    public GetAccountInformation createGetAccountInformation() {
        return new GetAccountInformation();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "getAccountInformationResponse")
    public JAXBElement<GetAccountInformationResponse> createGetAccountInformationResponse(GetAccountInformationResponse value) {
        return new JAXBElement<GetAccountInformationResponse>(_GetAccountInformationResponse_QNAME, GetAccountInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "getAccountInformation")
    public JAXBElement<GetAccountInformation> createGetAccountInformation(GetAccountInformation value) {
        return new JAXBElement<GetAccountInformation>(_GetAccountInformation_QNAME, GetAccountInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<CreateAccount>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

}
