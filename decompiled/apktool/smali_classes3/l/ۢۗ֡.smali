.class public final Ll/ۢۗ֡;
.super Ljava/lang/Object;
.source "Y5SH"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:Ljava/util/LinkedList;

.field public ܿ:Ll/ۢۗ֡;

.field public ᩳ:Ll/ۢۗ֡;

.field public final synthetic ᩻:Ll/ۡۗ֡;


# direct methods
.method public constructor <init>(Ll/ۡۗ֡;II)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۗ֡;->᩻:Ll/ۡۗ֡;

    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    .line 55
    iput-object p1, p0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 64
    iput p2, p0, Ll/ۢۗ֡;->ܳ:I

    .line 65
    iput p3, p0, Ll/ۢۗ֡;->ۧ:I

    .line 66
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Ll/ۢۗ֡;->ܽ:Ljava/util/LinkedList;

    .line 67
    iput-object p1, p0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    .line 68
    iput-object p1, p0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    const/4 p1, -0x1

    .line 69
    iput p1, p0, Ll/ۢۗ֡;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۢۗ֡;
    .locals 3

    .line 105
    new-instance v0, Ll/ۢۗ֡;

    iget-object v1, p0, Ll/ۢۗ֡;->᩻:Ll/ۡۗ֡;

    iget v2, p0, Ll/ۢۗ֡;->ۧ:I

    invoke-direct {v0, v1, p1, v2}, Ll/ۢۗ֡;-><init>(Ll/ۡۗ֡;II)V

    .line 106
    iget v1, p0, Ll/ۢۗ֡;->֫:I

    iput v1, v0, Ll/ۢۗ֡;->֫:I

    .line 107
    iget-object v1, v0, Ll/ۢۗ֡;->ܽ:Ljava/util/LinkedList;

    iget-object v2, p0, Ll/ۢۗ֡;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 75
    iget-object v1, p0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    iput-object v0, v1, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    .line 76
    iput-object v1, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 78
    iput-object v0, p0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 79
    iput-object p0, v0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    .line 110
    iput p1, p0, Ll/ۢۗ֡;->ۧ:I

    return-object v0
.end method

.method public final ֫(Ll/ۢۗ֡;)V
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    iput-object p1, v0, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    .line 86
    iput-object v0, p1, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    .line 88
    iput-object p1, p0, Ll/ۢۗ֡;->ܿ:Ll/ۢۗ֡;

    .line 89
    iput-object p0, p1, Ll/ۢۗ֡;->ᩳ:Ll/ۢۗ֡;

    return-void
.end method
