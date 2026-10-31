.class public final Ll/ܽۗ᩻;
.super Ljava/lang/Object;
.source "S98Z"

# interfaces
.implements Ll/ۜۗ᩻;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final synthetic ܽ:Ll/ᩳۗ᩻;


# direct methods
.method public constructor <init>(Ll/ᩳۗ᩻;)V
    .locals 0

    .line 2173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۗ᩻;->ܽ:Ll/ᩳۗ᩻;

    .line 2174
    invoke-virtual {p1}, Ll/ᩳۗ᩻;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/ܽۗ᩻;->֫:I

    const/4 p1, 0x0

    .line 2175
    iput p1, p0, Ll/ܽۗ᩻;->ۧ:I

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 2179
    iget v0, p0, Ll/ܽۗ᩻;->ۧ:I

    iget v1, p0, Ll/ܽۗ᩻;->֫:I

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 2182
    iput v2, p0, Ll/ܽۗ᩻;->ۧ:I

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, v0

    shr-int/lit8 v0, v1, 0x2

    .line 2184
    iget-object v2, p0, Ll/ܽۗ᩻;->ܽ:Ll/ᩳۗ᩻;

    invoke-virtual {v2, v0}, Ll/ܿۗ᩻;->ۧ(I)I

    move-result v0

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    ushr-int/2addr v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method
