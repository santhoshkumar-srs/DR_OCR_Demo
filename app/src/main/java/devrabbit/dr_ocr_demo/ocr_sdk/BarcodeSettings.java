/**
 * 
 */
package devrabbit.dr_ocr_demo.ocr_sdk;

/**
 * Barcode recognition settings.
 * 
 * For all possible parameters see
 * http://ocrsdk.com/documentation/apireference/processBarcodeField/
 */
public class BarcodeSettings {

	public String asUrlParams() {
		return "barcodeType=" + barcodeType;
	}

	public String getType() {
		return barcodeType;
	}

	public void setType(String newType) {
		barcodeType = newType;
	}

	private String barcodeType = "autodetect";
}
