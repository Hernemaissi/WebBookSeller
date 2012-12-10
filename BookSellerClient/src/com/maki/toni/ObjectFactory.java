
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

    private final static QName _Book_QNAME = new QName("http://toni.wst.com/", "book");
    private final static QName _Deposit_QNAME = new QName("http://toni.maki.com/", "deposit");
    private final static QName _DepositResponse_QNAME = new QName("http://toni.maki.com/", "depositResponse");
    private final static QName _CreateResponse_QNAME = new QName("http://toni.maki.com/", "createResponse");
    private final static QName _OrderBook_QNAME = new QName("http://toni.maki.com/", "orderBook");
    private final static QName _Create_QNAME = new QName("http://toni.maki.com/", "create");
    private final static QName _GetRating_QNAME = new QName("http://toni.maki.com/", "getRating");
    private final static QName _GetRatingResponse_QNAME = new QName("http://toni.maki.com/", "getRatingResponse");
    private final static QName _OrderBookResponse_QNAME = new QName("http://toni.maki.com/", "orderBookResponse");
    private final static QName _SearchBooks_QNAME = new QName("http://toni.maki.com/", "searchBooks");
    private final static QName _SearchBooksResponse_QNAME = new QName("http://toni.maki.com/", "searchBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.maki.toni
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link GetRating }
     * 
     */
    public GetRating createGetRating() {
        return new GetRating();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link GetRatingResponse }
     * 
     */
    public GetRatingResponse createGetRatingResponse() {
        return new GetRatingResponse();
    }

    /**
     * Create an instance of {@link SearchBooks }
     * 
     */
    public SearchBooks createSearchBooks() {
        return new SearchBooks();
    }

    /**
     * Create an instance of {@link SearchBooksResponse }
     * 
     */
    public SearchBooksResponse createSearchBooksResponse() {
        return new SearchBooksResponse();
    }

    /**
     * Create an instance of {@link OrderBookResponse }
     * 
     */
    public OrderBookResponse createOrderBookResponse() {
        return new OrderBookResponse();
    }

    /**
     * Create an instance of {@link OrderBook }
     * 
     */
    public OrderBook createOrderBook() {
        return new OrderBook();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.wst.com/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "orderBook")
    public JAXBElement<OrderBook> createOrderBook(OrderBook value) {
        return new JAXBElement<OrderBook>(_OrderBook_QNAME, OrderBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "getRating")
    public JAXBElement<GetRating> createGetRating(GetRating value) {
        return new JAXBElement<GetRating>(_GetRating_QNAME, GetRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "getRatingResponse")
    public JAXBElement<GetRatingResponse> createGetRatingResponse(GetRatingResponse value) {
        return new JAXBElement<GetRatingResponse>(_GetRatingResponse_QNAME, GetRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "orderBookResponse")
    public JAXBElement<OrderBookResponse> createOrderBookResponse(OrderBookResponse value) {
        return new JAXBElement<OrderBookResponse>(_OrderBookResponse_QNAME, OrderBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "searchBooks")
    public JAXBElement<SearchBooks> createSearchBooks(SearchBooks value) {
        return new JAXBElement<SearchBooks>(_SearchBooks_QNAME, SearchBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://toni.maki.com/", name = "searchBooksResponse")
    public JAXBElement<SearchBooksResponse> createSearchBooksResponse(SearchBooksResponse value) {
        return new JAXBElement<SearchBooksResponse>(_SearchBooksResponse_QNAME, SearchBooksResponse.class, null, value);
    }

}
