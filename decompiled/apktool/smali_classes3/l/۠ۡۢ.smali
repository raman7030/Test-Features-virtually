.class public final synthetic Ll/۠ۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܰۡۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰۡۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۡۢ;->᩸:Ll/ܰۡۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 899
    iget-object p1, p0, Ll/۠ۡۢ;->᩸:Ll/ܰۡۢ;

    iget-object p2, p1, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    invoke-static {p2}, Ll/ۡܺۢ;->֫(Ll/ܽܺۢ;)Z

    .line 900
    iget-object p2, p1, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    const/4 v0, -0x2

    iput v0, p2, Ll/ܽܺۢ;->۫:I

    .line 901
    iget-object v0, p1, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    iget-object p1, p1, Ll/ܰۡۢ;->ۙ:Landroid/widget/TextView;

    invoke-static {v0, p2, p1}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ll/ܽܺۢ;Landroid/widget/TextView;)V

    return-void
.end method
