package fspm.config.adapters.handlers;

import java.io.FileNotFoundException;

import fspm.config.params.group.ParamGroup;

public abstract class MetaclassHandler {
	public abstract ParamGroup parse(String path) throws FileNotFoundException;
}
