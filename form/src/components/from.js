import { Box, Button, Container, Grid, makeStyles, } from "@material-ui/core";
import Field from "./fields";
import Group from "./Group";

const useStyles = makeStyles(theme =>({

        root:{
            padding:`${theme.spacing(2)}px 0px`,
            width:"70%",
            margin:`${theme.spacing(3)}px auto`,
            [theme.breakpoints.down("sm")]:{
                            width:"100%",

            }
        },
        textfield:{
            width:"100%",
        },
        form:{
              
            width:"500px",
            margin:"auto",
            [theme.breakpoints.down("sm")]:{
                width:"100%" ,
            }
        },
        save:{
            textAlign:"center",
            marginTop:theme.spacing(2)
        },
        btn:{
            backgroundColor:"#282c34",
            color:"white",
            padding:`${theme.spacing(1)}px ${theme.spacing(3)}px `,
            '&:hover':{
                    backgroundColor:"#585858"
            }
        }
        

}))


const Form = () => {
    const classes =useStyles()
    return <Container >
                <Box className={classes.root}>
                 <form className={classes.form}>
                    <Field name="arrdate" type="date" labal="Arrival date" />
                    <Group>
                        <Grid item xs={6}><Field name="ssup" labal="Source supplier"/></Grid>
                        <Grid item xs={6}><Field name="phone" ph="### ### ####" labal="Phone"/></Grid>
                        <Grid item xs={6}><Field name="prby"   labal="Purchased by:"/></Grid>
                        <Grid item xs={6}><Field name="ccpNo" labal="Confidantal clue page no"/></Grid>
                    </Group>
                     <Field name="address1"  labal="Address" ph="Street Address" />
                     <Field name="address2"   ph="Street Address line 2" />
                     <Group>
                        <Grid item xs={6}><Field name="city" ph="City" /></Grid>
                        <Grid item xs={6}><Field name="region" ph="Region"/></Grid>
                        <Grid item xs={6}><Field name="pscode"  ph="Postal /Zip Code"/></Grid>
                        <Grid item xs={6}><Field name="country" ph="Romania"/></Grid>
                    </Group>

                    <Group>
                        <Grid item xs={6}><Field name="cn" labal="Classification No" /></Grid>
                        <Grid item xs={6}><Field name="am" labal="Auther Marks"/></Grid>
                        <Grid item xs={6}><Field name="usc" labal="usabilty Condition"/></Grid>
                        <Grid item xs={6}><Field name="ed" type="date" labal="Entry date"/></Grid>
                        <Grid item xs={6}><Field name="pp"  labal="Publish place"/></Grid>
                        <Grid item xs={6}><Field name="nc"  labal="No of copies"/></Grid>
                    </Group>

                    <Field name="an" labal="accession no" />
                    <Field name="rm" labal="remarks" multiline={true}/>
                    <Box className={classes.save}>
                        <Button variant="contained" className={classes.btn}>Save</Button>
                    </Box>




                </form>
                </Box>

            </Container>
}
 
export default Form;