.class public final Ll/ۖ᩶֡;
.super Ljava/lang/Object;
.source "O69P"


# instance fields
.field public final ֫:Ll/ۡ᩶֡;

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>(IILl/ۡ᩶֡;)V
    .locals 0

    .line 962
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 963
    iput p1, p0, Ll/ۖ᩶֡;->ۧ:I

    .line 964
    iput p2, p0, Ll/ۖ᩶֡;->ܽ:I

    .line 965
    iput-object p3, p0, Ll/ۖ᩶֡;->֫:Ll/ۡ᩶֡;

    return-void
.end method

.method public constructor <init>(Ll/ۧۗ֡;Ll/᩻ۗ֡;)V
    .locals 1

    .line 976
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 977
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ۖ᩶֡;->ۧ:I

    .line 978
    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/ۖ᩶֡;->ܽ:I

    .line 980
    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/᩻ۗ֡;->ۧ(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ᩶֡;

    iput-object p1, p0, Ll/ۖ᩶֡;->֫:Ll/ۡ᩶֡;

    if-eqz p1, :cond_0

    return-void

    .line 982
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Could not find the EncodedCatchHandler referenced by this TryItem"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۖ᩶֡;Ll/֫ۗ֡;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    iget v0, p0, Ll/ۖ᩶֡;->ۧ:I

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 1000
    iget v0, p0, Ll/ۖ᩶֡;->ܽ:I

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 1001
    iget-object p0, p0, Ll/ۖ᩶֡;->֫:Ll/ۡ᩶֡;

    invoke-static {p0}, Ll/ۡ᩶֡;->֫(Ll/ۡ᩶֡;)I

    move-result p0

    invoke-virtual {p1, p0}, Ll/֫ۗ֡;->ᩳ(I)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 1008
    iget v0, p0, Ll/ۖ᩶֡;->ۧ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 1015
    iget v0, p0, Ll/ۖ᩶֡;->ܽ:I

    return v0
.end method
