//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.20 at 11:57:09 AM PST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _ItemList_QNAME = new QName("", "item_list");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link LearningTaxonomyList }
     * 
     */
    public LearningTaxonomyList createLearningTaxonomyList() {
        return new LearningTaxonomyList();
    }

    /**
     * Create an instance of {@link QuestionList }
     * 
     */
    public QuestionList createQuestionList() {
        return new QuestionList();
    }

    /**
     * Create an instance of {@link QuestionList.Question.OptionList }
     * 
     */
    public QuestionList.Question.OptionList createQuestionListQuestionOptionList() {
        return new QuestionList.Question.OptionList();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link ImageList }
     * 
     */
    public ImageList createImageList() {
        return new ImageList();
    }

    /**
     * Create an instance of {@link TopicList }
     * 
     */
    public TopicList createTopicList() {
        return new TopicList();
    }

    /**
     * Create an instance of {@link QuestionList.Question }
     * 
     */
    public QuestionList.Question createQuestionListQuestion() {
        return new QuestionList.Question();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "item_list")
    public JAXBElement<ItemList> createItemList(ItemList value) {
        return new JAXBElement<ItemList>(_ItemList_QNAME, ItemList.class, null, value);
    }

}