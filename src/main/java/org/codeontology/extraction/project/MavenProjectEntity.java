package org.codeontology.extraction.project;

import com.hp.hpl.jena.rdf.model.RDFNode;
import org.codeontology.Ontology;
import org.codeontology.build.maven.MavenProject;

public class MavenProjectEntity extends ProjectEntity<MavenProject> {

    public MavenProjectEntity(MavenProject project) {
        super(project);
    }

    @Override
    protected RDFNode getType() {
        return Ontology.MAVEN_PROJECT_ENTITY;
    }
}
