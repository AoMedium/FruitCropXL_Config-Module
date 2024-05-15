package fspm.config.adapters.handlers;

import java.io.FileNotFoundException;
import fspm.config.params.group.DocumentHybridCategoryNameGroup;
import fspm.config.params.hierarchy.CategoryHierarchy;
import fspm.config.params.hierarchy.TableHierarchy;

public class DocumentHybridCategoryNameHandler extends MetaclassHandler {
	public DocumentHybridCategoryNameGroup parse(String path) throws FileNotFoundException {

		CategoryHierarchy categoryHierarchy = CategoryHierarchy.parse(path);
		TableHierarchy tableHierarchy = TableHierarchy.parse(path);

		DocumentHybridCategoryNameGroup group = new DocumentHybridCategoryNameGroup(path, categoryHierarchy,
				tableHierarchy);
		return group;
	}
}