.class public final synthetic Ll/ۢܿ᩻;
.super Ljava/lang/Object;
.source "G9AG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۖۢܳ;

.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ll/ۢۘܳ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/ۢۘܳ;Ll/ۖۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܿ᩻;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۢܿ᩻;->᩹:Ll/ۢۘܳ;

    iput-object p3, p0, Ll/ۢܿ᩻;->᩶:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 47
    iget-object p1, p0, Ll/ۢܿ᩻;->᩹:Ll/ۢۘܳ;

    invoke-virtual {p1}, Ll/ۢۘܳ;->ܺ()I

    move-result p1

    iget-object p2, p0, Ll/ۢܿ᩻;->᩸:Ljava/util/ArrayList;

    invoke-static {p2, p1}, Ll/ۡᩴܳ;->֫(Ljava/util/ArrayList;I)V

    .line 48
    iget-object p1, p0, Ll/ۢܿ᩻;->᩶:Ll/ۖۢܳ;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {p1}, Ll/֨ۨܳ;->֫(Lbin/mt/plus/Main;)V

    return-void
.end method
