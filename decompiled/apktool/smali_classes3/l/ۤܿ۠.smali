.class public final enum Ll/ۤܿ۠;
.super Ll/ۛܿ۠;
.source "X44P"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "REVERSE"

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۤܿ۠;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 118
    invoke-direct {p0, p1, p2, v0}, Ll/ۛܿ۠;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 118
    check-cast p1, Ll/᩷۠ᩴ;

    check-cast p2, Ll/᩷۠ᩴ;

    invoke-virtual {p0, p1, p2}, Ll/ۤܿ۠;->֫(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)I

    move-result p1

    return p1
.end method

.method public ֫(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)I
    .locals 0

    .line 121
    invoke-interface {p2}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {p2, p1}, Ll/᩷۠ᩴ;->compareTo(Ll/᩷۠ᩴ;)I

    move-result p1

    return p1
.end method
