
= What is this Maven plugin


= How to use

On the command line run: 


[source,xml]
-------------------------------------------

		<plugins>
			<plugin>
				<groupId>com.teamtter.i18n</groupId>
				<artifactId></artifactId>
				<executions>
					<execution>
						<id></id>
						<goals>
							<goal></goal>	<!-- this goal is bind by default to the XXX  phase of the maven lifecycle -->
						</goals>
					</execution>
				</executions>
				<configuration>
					<skip>false</skip>
					<failOnError>false</failOnError>
				</configuration>
				<inherited>false</inherited>
			</plugin>

-------------------------------------------
