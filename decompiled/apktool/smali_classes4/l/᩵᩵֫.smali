.class public final Ll/᩵᩵֫;
.super Ljava/lang/Object;
.source "98OO"


# instance fields
.field public final ֫:Ll/ۚᩴ֫;


# direct methods
.method public constructor <init>(Ll/ۚᩴ֫;)V
    .locals 0

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Ll/᩵᩵֫;->֫:Ll/ۚᩴ֫;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 236
    :cond_0
    instance-of v0, p1, Ll/᩵᩵֫;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 239
    :cond_1
    check-cast p1, Ll/᩵᩵֫;

    .line 240
    iget-object v0, p0, Ll/᩵᩵֫;->֫:Ll/ۚᩴ֫;

    iget-object p1, p1, Ll/᩵᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 228
    iget-object v0, p0, Ll/᩵᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0}, Ll/ۚᩴ֫;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 194
    iget-object v0, p0, Ll/᩵᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final varargs ֫([I)Z
    .locals 1

    .line 204
    iget-object v0, p0, Ll/᩵᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->֫([I)Z

    move-result p1

    return p1
.end method
