.class public final synthetic Ll/֫ᩳܳ;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/᩸ܽܳ;


# instance fields
.field public final synthetic ֫:[B

.field public final synthetic ۧ:I

.field public final synthetic ܽ:I

.field public final synthetic ᩳ:B


# direct methods
.method public synthetic constructor <init>([BIIB)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩳܳ;->֫:[B

    iput p2, p0, Ll/֫ᩳܳ;->ۧ:I

    iput p3, p0, Ll/֫ᩳܳ;->ܽ:I

    iput-byte p4, p0, Ll/֫ᩳܳ;->ᩳ:B

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 1

    .line 1068
    iget p1, p0, Ll/֫ᩳܳ;->ۧ:I

    add-int/2addr p1, p2

    iget p2, p0, Ll/֫ᩳܳ;->ܽ:I

    sub-int/2addr p1, p2

    iget-object p2, p0, Ll/֫ᩳܳ;->֫:[B

    iget-byte v0, p0, Ll/֫ᩳܳ;->ᩳ:B

    aput-byte v0, p2, p1

    return-void
.end method
