.class public final Ll/֫ᩳ;
.super Ljava/lang/Object;
.source "38CF"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ܺ᩹᩵;

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILl/ܺ᩹᩵;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput p1, p0, Ll/֫ᩳ;->ܽ:I

    .line 99
    iput p2, p0, Ll/֫ᩳ;->֫:I

    .line 101
    iput-object p3, p0, Ll/֫ᩳ;->ۧ:Ll/ܺ᩹᩵;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 99
    iget v0, p0, Ll/֫ᩳ;->֫:I

    return v0
.end method

.method public final ֫(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 179
    iget p1, p0, Ll/֫ᩳ;->֫:I

    return p1

    :cond_0
    iget p1, p0, Ll/֫ᩳ;->ܽ:I

    return p1
.end method

.method public final ۧ()Ll/ܺ᩹᩵;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/֫ᩳ;->ۧ:Ll/ܺ᩹᩵;

    return-object v0
.end method
