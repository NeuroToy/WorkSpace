<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" />
	<xsl:template match="/">
		<html>
			<body>
				<table>
					<td>
						<tr>
							<xsl:value-of select="x" />
						</tr>
						<tr>
							<xsl:value-of select="y" />
						</tr>
						<tr>
							<xsl:value-of select="unit" />
						</tr>
					</td>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
