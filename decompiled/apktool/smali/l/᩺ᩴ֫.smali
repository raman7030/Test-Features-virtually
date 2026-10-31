.class public final Ll/᩺ᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# static fields
.field public static final ֫:Ll/᩺ᩴ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2212
    new-instance v0, Ll/᩺ᩴ֫;

    .line 2231
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2171
    sput-object v0, Ll/᩺ᩴ֫;->֫:Ll/᩺ᩴ֫;

    const/4 v0, 0x0

    .line 2264
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 2265
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 2266
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2247
    :cond_0
    instance-of p1, p1, Ll/᩺ᩴ֫;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
