package com.oleamedical.i18n.finder;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.project.MavenProject;
import org.sonatype.plexus.build.incremental.BuildContext;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Mojo(name = "properties2java", /** the goal */
threadSafe = false, /** until proven otherwise, false */
defaultPhase = LifecyclePhase.GENERATE_SOURCES,
requiresDependencyResolution = ResolutionScope.NONE,
requiresProject = false)
@Slf4j
public class Properties2JavaMojo extends AbstractMojo {

	@Parameter(defaultValue = "${project}", readonly = true)
	@Setter
	private MavenProject	mavenProject;

	@Parameter(property = "rootDirectory", defaultValue = "${project.basedir}")	// alternative: use "session.executionRootDirectory"
	@Setter
	private File			rootDirectory;

	@Parameter(property = "skip", defaultValue = "false")
	@Setter
	private boolean			skip;

	@Parameter(property = "failOnError", defaultValue = "true")
	@Setter
	private boolean			failOnError;
	
	@Parameter(property = "propertiesFilename", defaultValue = "true")
	@Setter
	private boolean			propertiesFilename;

	@Component
	@Setter
	private BuildContext	buildContext;
	
	

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		if (skip) {
			log.info("properties2java :: skipping execution due to 'skip' == true");
		} else {
			properties2java();
		}
	}

	private void properties2java() throws MojoExecutionException {
		
		
	}

}
