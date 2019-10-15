
package com.revature;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature package. 
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

    private final static QName _AddFlashcardResponse_QNAME = new QName("http://service.revature.com/", "addFlashcardResponse");
    private final static QName _GetAllFlashcardsResponse_QNAME = new QName("http://service.revature.com/", "getAllFlashcardsResponse");
    private final static QName _StudyException_QNAME = new QName("http://service.revature.com/", "StudyException");
    private final static QName _AddFlashcard_QNAME = new QName("http://service.revature.com/", "addFlashcard");
    private final static QName _GetAllFlashcards_QNAME = new QName("http://service.revature.com/", "getAllFlashcards");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudyException }
     * 
     */
    public StudyException createStudyException() {
        return new StudyException();
    }

    /**
     * Create an instance of {@link AddFlashcard }
     * 
     */
    public AddFlashcard createAddFlashcard() {
        return new AddFlashcard();
    }

    /**
     * Create an instance of {@link GetAllFlashcards }
     * 
     */
    public GetAllFlashcards createGetAllFlashcards() {
        return new GetAllFlashcards();
    }

    /**
     * Create an instance of {@link AddFlashcardResponse }
     * 
     */
    public AddFlashcardResponse createAddFlashcardResponse() {
        return new AddFlashcardResponse();
    }

    /**
     * Create an instance of {@link GetAllFlashcardsResponse }
     * 
     */
    public GetAllFlashcardsResponse createGetAllFlashcardsResponse() {
        return new GetAllFlashcardsResponse();
    }

    /**
     * Create an instance of {@link Flashcard }
     * 
     */
    public Flashcard createFlashcard() {
        return new Flashcard();
    }

    /**
     * Create an instance of {@link Topic }
     * 
     */
    public Topic createTopic() {
        return new Topic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFlashcardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "addFlashcardResponse")
    public JAXBElement<AddFlashcardResponse> createAddFlashcardResponse(AddFlashcardResponse value) {
        return new JAXBElement<AddFlashcardResponse>(_AddFlashcardResponse_QNAME, AddFlashcardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFlashcardsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "getAllFlashcardsResponse")
    public JAXBElement<GetAllFlashcardsResponse> createGetAllFlashcardsResponse(GetAllFlashcardsResponse value) {
        return new JAXBElement<GetAllFlashcardsResponse>(_GetAllFlashcardsResponse_QNAME, GetAllFlashcardsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudyException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "StudyException")
    public JAXBElement<StudyException> createStudyException(StudyException value) {
        return new JAXBElement<StudyException>(_StudyException_QNAME, StudyException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFlashcard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "addFlashcard")
    public JAXBElement<AddFlashcard> createAddFlashcard(AddFlashcard value) {
        return new JAXBElement<AddFlashcard>(_AddFlashcard_QNAME, AddFlashcard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFlashcards }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.revature.com/", name = "getAllFlashcards")
    public JAXBElement<GetAllFlashcards> createGetAllFlashcards(GetAllFlashcards value) {
        return new JAXBElement<GetAllFlashcards>(_GetAllFlashcards_QNAME, GetAllFlashcards.class, null, value);
    }

}
