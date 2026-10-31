.class public final Ll/᩶ۚۧ;
.super Ljava/lang/Object;
.source "V8JA"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:[B

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>([BIIII)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput p2, p0, Ll/᩶ۚۧ;->ᩳ:I

    .line 54
    iput p3, p0, Ll/᩶ۚۧ;->ܳ:I

    .line 55
    iput p4, p0, Ll/᩶ۚۧ;->ܿ:I

    mul-int p3, p3, p5

    .line 58
    div-int/lit8 p3, p3, 0x8

    iput p3, p0, Ll/᩶ۚۧ;->ۧ:I

    .line 59
    iput p5, p0, Ll/᩶ۚۧ;->֫:I

    .line 60
    iput-object p1, p0, Ll/᩶ۚۧ;->ܽ:[B

    return-void
.end method
