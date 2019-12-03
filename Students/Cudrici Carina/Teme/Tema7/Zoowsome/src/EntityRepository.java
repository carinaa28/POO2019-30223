public abstract class EntityRepository<T extends XML_Parsable>
 {
private final String xmlFilename;
private final String entityTag;
public EntityRepository(String xmlFilename, String entityTag) {
this.xmlFilename = xmlFilename;
this.entityTag = entityTag;
}
}