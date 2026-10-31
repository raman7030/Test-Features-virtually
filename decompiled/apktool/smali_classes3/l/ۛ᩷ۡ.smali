.class public final synthetic Ll/ۛ᩷ۡ;
.super Ljava/lang/Object;
.source "U8UP"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/ۘ᩸;

.field public final synthetic ۧ:Ll/ܿ᩸;

.field public final synthetic ܽ:Ll/ۘ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/ۘ᩸;Ll/ܿ᩸;Ll/ۘ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩷ۡ;->֫:Ll/ۘ᩸;

    iput-object p2, p0, Ll/ۛ᩷ۡ;->ۧ:Ll/ܿ᩸;

    iput-object p3, p0, Ll/ۛ᩷ۡ;->ܽ:Ll/ۘ᩸;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Landroid/content/res/Configuration;

    .line 31
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    iget-object v1, p0, Ll/ۛ᩷ۡ;->ۧ:Ll/ܿ᩸;

    if-ne p1, v0, :cond_0

    .line 32
    iget-object p1, p0, Ll/ۛ᩷ۡ;->֫:Ll/ۘ᩸;

    invoke-virtual {p1, v1}, Ll/ۘ᩸;->֫(Ll/ܿ᩸;)V

    return-void

    .line 34
    :cond_0
    iget-object p1, p0, Ll/ۛ᩷ۡ;->ܽ:Ll/ۘ᩸;

    invoke-virtual {p1, v1}, Ll/ۘ᩸;->֫(Ll/ܿ᩸;)V

    return-void
.end method
