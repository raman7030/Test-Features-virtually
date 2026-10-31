.class public final synthetic Ll/֨᩹ᩳ;
.super Ljava/lang/Object;
.source "26UL"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:I

.field public final synthetic ᩶:[C

.field public final synthetic ᩸:Ll/᩸᩹ᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩸᩹ᩳ;I[CII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩹ᩳ;->᩸:Ll/᩸᩹ᩳ;

    iput p2, p0, Ll/֨᩹ᩳ;->᩹:I

    iput-object p3, p0, Ll/֨᩹ᩳ;->᩶:[C

    iput p4, p0, Ll/֨᩹ᩳ;->ۙ:I

    iput p5, p0, Ll/֨᩹ᩳ;->ۗ:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 0
    iget v0, p0, Ll/֨᩹ᩳ;->ۙ:I

    iget v1, p0, Ll/֨᩹ᩳ;->ۗ:I

    iget-object v2, p0, Ll/֨᩹ᩳ;->᩸:Ll/᩸᩹ᩳ;

    iget v3, p0, Ll/֨᩹ᩳ;->᩹:I

    iget-object v4, p0, Ll/֨᩹ᩳ;->᩶:[C

    invoke-static {v2, v3, v4, v0, v1}, Ll/᩸᩹ᩳ;->֫(Ll/᩸᩹ᩳ;I[CII)Ll/ۧ۫ᩳ;

    move-result-object v0

    return-object v0
.end method
