.class public final synthetic Ll/᩹᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܽۢܳ;

.field public final synthetic ᩹:Ll/ܽۙܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۢܳ;Ll/ܽۙܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩶ܳ;->᩸:Ll/ܽۢܳ;

    iput-object p2, p0, Ll/᩹᩶ܳ;->᩹:Ll/ܽۙܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 738
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "//SEARCH//"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Ll/᩹᩶ܳ;->᩹:Ll/ܽۙܳ;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    iget-object v0, p0, Ll/᩹᩶ܳ;->᩸:Ll/ܽۢܳ;

    invoke-virtual {v0, p1, p2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method
