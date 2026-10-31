.class public abstract Ll/֫᩶֡;
.super Ljava/lang/Object;
.source "R524"


# instance fields
.field public final ֫:Ll/᩻᩶֡;


# direct methods
.method public constructor <init>(Ll/᩻᩶֡;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    return-void
.end method


# virtual methods
.method public ֫(I)I
    .locals 0

    .line 45
    iget-object p1, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-object p1, p1, Ll/᩻᩶֡;->᩹:Ll/᩻᩸֡;

    iget p1, p1, Ll/᩻᩸֡;->᩹:I

    div-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public final ֫(Ll/֫ۗ֡;I)I
    .locals 0

    .line 58
    invoke-virtual {p0, p1, p2}, Ll/֫᩶֡;->ۧ(Ll/֫ۗ֡;I)V

    .line 59
    invoke-virtual {p0, p2}, Ll/֫᩶֡;->֫(I)I

    move-result p1

    add-int/2addr p1, p2

    return p1
.end method

.method public abstract ۢ()Ll/᩻᩸֡;
.end method

.method public abstract ۧ(Ll/֫ۗ֡;I)V
.end method
