.class public final synthetic Ll/ۙۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܰۡۢ;

.field public final synthetic ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰۡۢ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۡۢ;->᩸:Ll/ܰۡۢ;

    iput-object p2, p0, Ll/ۙۡۢ;->᩹:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 931
    iget-object p1, p0, Ll/ۙۡۢ;->᩸:Ll/ܰۡۢ;

    iget-object p1, p1, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    iget-object p2, p0, Ll/ۙۡۢ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    sget v0, Ll/۟ۡۢ;->ᩴۧ:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    invoke-static {p1, p2}, Lbin/mt/plus/Main;->֫(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
