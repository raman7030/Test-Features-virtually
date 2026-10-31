.class public final Ll/֫ܶܳ;
.super Ll/֨ܶܳ;
.source "37CJ"


# static fields
.field private static final ۙ᩸᩶:[S


# instance fields
.field public final ۗ:Z

.field public final ۙ:Ll/ۗ᩻᩻;

.field public final ᩶:Ll/ۗܶܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1b

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֫ܶܳ;->ۙ᩸᩶:[S

    return-void

    :array_0
    .array-data 2
        0x244ds
        0x71ecs
        0x71f6s
        0x2e3cs
        0x2d23s
        0x3eccs
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 229
    iput-object p2, p0, Ll/֫ܶܳ;->᩶:Ll/ۗܶܳ;

    const/4 p1, 0x0

    .line 230
    iput-object p1, p0, Ll/֫ܶܳ;->ۙ:Ll/ۗ᩻᩻;

    const/4 p1, 0x1

    .line 231
    iput-boolean p1, p0, Ll/֫ܶܳ;->ۗ:Z

    return-void
.end method

.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;Ll/ۗ᩻᩻;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 222
    iput-object p2, p0, Ll/֫ܶܳ;->᩶:Ll/ۗܶܳ;

    .line 223
    iput-object p3, p0, Ll/֫ܶܳ;->ۙ:Ll/ۗ᩻᩻;

    const/4 p1, 0x0

    .line 224
    iput-boolean p1, p0, Ll/֫ܶܳ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public native onClick(Landroid/view/View;)V
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 243
    iget-boolean v0, p0, Ll/֫ܶܳ;->ۗ:Z

    return v0
.end method
