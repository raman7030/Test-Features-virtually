.class public final Ll/ܶۛ᩷;
.super Ljava/lang/ThreadLocal;
.source "A1E3"


# instance fields
.field public final ֫:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>(Ll/ۨۘܽ;)V
    .locals 0

    .line 218
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 219
    iput-object p1, p0, Ll/ܶۛ᩷;->֫:Ll/ۨۘܽ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 215
    invoke-virtual {p0}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object v0

    return-object v0
.end method

.method public final get()Ll/۫ۘܽ;
    .locals 1

    .line 230
    invoke-super {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ۘܽ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final initialValue()Ljava/lang/Object;
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ܶۛ᩷;->֫:Ll/ۨۘܽ;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    return-object v0
.end method
