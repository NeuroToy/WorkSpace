<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" />
	<xsl:template match="/pointList">
		<html>
			<body>
				<table border="1">
					<xsl:for-each select="point">
						<tr>
							<td>
								<xsl:value-of select="x" />
							</td>
							<td>
								<xsl:value-of select="y" />
							</td>
							<td>
								<xsl:value-of select="unit" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
