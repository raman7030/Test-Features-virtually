.class public final Ll/۠ᩴۧ;
.super Ljava/lang/Object;
.source "M8UR"


# instance fields
.field public ֫:I

.field public final ۧ:[B

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 846
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 847
    iput p1, p0, Ll/۠ᩴۧ;->ᩳ:I

    .line 848
    iput p2, p0, Ll/۠ᩴۧ;->ܽ:I

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, -0x1

    .line 849
    new-array p1, p2, [B

    iput-object p1, p0, Ll/۠ᩴۧ;->ۧ:[B

    const/4 p1, 0x0

    .line 850
    iput p1, p0, Ll/۠ᩴۧ;->֫:I

    return-void
.end method
