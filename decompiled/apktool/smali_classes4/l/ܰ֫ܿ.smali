.class public final synthetic Ll/ܰ֫ܿ;
.super Ljava/lang/Object;
.source "L6R5"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ljava/lang/CharSequence;

.field public final synthetic ۬:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֫ۧܿ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/֫ۧܿ;IILjava/lang/CharSequence;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ֫ܿ;->᩸:Ll/֫ۧܿ;

    iput p2, p0, Ll/ܰ֫ܿ;->᩹:I

    iput p3, p0, Ll/ܰ֫ܿ;->᩶:I

    iput-object p4, p0, Ll/ܰ֫ܿ;->ۙ:Ljava/lang/CharSequence;

    iput p5, p0, Ll/ܰ֫ܿ;->ۗ:I

    iput p6, p0, Ll/ܰ֫ܿ;->۬:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 0
    iget v4, p0, Ll/ܰ֫ܿ;->ۗ:I

    iget v5, p0, Ll/ܰ֫ܿ;->۬:I

    iget-object v0, p0, Ll/ܰ֫ܿ;->᩸:Ll/֫ۧܿ;

    iget v1, p0, Ll/ܰ֫ܿ;->᩹:I

    iget v2, p0, Ll/ܰ֫ܿ;->᩶:I

    iget-object v3, p0, Ll/ܰ֫ܿ;->ۙ:Ljava/lang/CharSequence;

    invoke-static/range {v0 .. v5}, Ll/֫ۧܿ;->֫(Ll/֫ۧܿ;IILjava/lang/CharSequence;II)V

    const/4 v0, 0x0

    return-object v0
.end method
