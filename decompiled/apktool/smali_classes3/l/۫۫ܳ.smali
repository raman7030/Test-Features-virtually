.class public final synthetic Ll/۫۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۤ۫ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤ۫ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫۫ܳ;->᩸:Ll/ۤ۫ܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 431
    iget-object p1, p0, Ll/۫۫ܳ;->᩸:Ll/ۤ۫ܳ;

    iget-object v0, p1, Ll/ۤ۫ܳ;->᩻:Ll/ۛ۫ܳ;

    invoke-static {v0}, Ll/ۛ۫ܳ;->᩻(Ll/ۛ۫ܳ;)Ll/۬۫ܳ;

    move-result-object v1

    iget p1, p1, Ll/ۤ۫ܳ;->ܳ:I

    invoke-virtual {v1, p1}, Ll/۬۫ܳ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 433
    invoke-static {v0}, Ll/ۛ۫ܳ;->ۢ(Ll/ۛ۫ܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
