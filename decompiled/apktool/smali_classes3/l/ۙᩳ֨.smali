.class public Ll/ۙᩳ֨;
.super Ll/֨ᩳ֨;
.source "97F2"


# instance fields
.field public ۗ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILl/᩶۬ۚ;Ljava/lang/String;)V
    .locals 0

    .line 217
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֨ᩳ֨;-><init>(ILjava/lang/String;ILl/᩶۬ۚ;)V

    if-eqz p5, :cond_0

    .line 218
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    :goto_0
    iput-object p5, p0, Ll/ۙᩳ֨;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final hashCode()I
    .locals 2

    .line 227
    iget-object v0, p0, Ll/ۙᩳ֨;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 228
    :goto_0
    invoke-super {p0}, Ll/֨ᩳ֨;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ۙᩳ֨;->ۗ:Ljava/lang/String;

    return-object v0
.end method
