public void actionPerformed(ActionEvent e) 
{
    try {
              MessageFormat headerFormat = new MessageFormat("Page {0}");
              MessageFormat footerFormat = new MessageFormat("- {0} -");
              table.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
            } 
	catch (PrinterException pe) 
	{
              System.err.println("Error printing: " + pe.getMessage());
        }
}









 int days = (int)(Math.round(jDateChooser2.getDate().getTime() - jDateChooser1.getDate().getTime())/(1000*60*60*24));     
        JOptionPane.showMessageDialog(rootPane, String.valueOf(days));