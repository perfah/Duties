Duties 2.0 for the new Minecraft API (Workbench)
================================================

Duties provides an escape route for admins and mods (these who do have the permission), to let them save all their survival stuff and later be able to revert back to it. For example, you are adventuring in a cave then someone tells you that someone has griefed his house. Just type /dutymode and go investigate it. When you're done, type it again, and you are back in the cave with your armor, sword etc... 

The planned release time is just after the Minecraft API has become released and usable. I estimate it to be ready when Minecraft gets it's 1.6 update. Until then I will keep updating Duties 1.x in case there's a reported bug or something breaks.

Please keep in mind that the project is far from done, and there are still major decisions left to make regarding the workflow. Therefore, it's still too early to draw any conclusion about the project.

Links:
* Old project page: http://bit.ly/Nqadlg
* Twitter: http://bit.ly/QIqD8e
* Workbench: http://bit.ly/QKeEZ6

Changes
--------
* Rewritten for Workbench, the new Minecraft API
* Safe survival state saving to files (this means no more data lost on server crashes)
* Possibly a new survival player simulator, which means that it could spawn a npc on the location you were off-duty
* Integrated profile management (previously known as Duties-Groups)
* Integrated statistics management (previously known as Duties-Stats), might add MySQL and/or SQLite support on that
* Auto updating and self repairing configuration files
* ...