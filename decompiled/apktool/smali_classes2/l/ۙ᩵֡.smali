.class public final Ll/ۙ᩵֡;
.super Ljava/lang/Object;
.source "O8YC"


# instance fields
.field public final ֫:Ll/ۡ᩵֡;

.field public final ۧ:Ljava/util/List;

.field public final ܳ:I

.field public final ܽ:Ljava/util/List;

.field public final ܿ:Ljava/util/List;

.field public final ᩳ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;ILl/ۡ᩵֡;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ۙ᩵֡;->ܽ:Ljava/util/List;

    .line 28
    iput-object p2, p0, Ll/ۙ᩵֡;->ۧ:Ljava/util/List;

    .line 29
    iput-object p3, p0, Ll/ۙ᩵֡;->ܿ:Ljava/util/List;

    .line 30
    iput-object p4, p0, Ll/ۙ᩵֡;->ᩳ:Ljava/util/Set;

    .line 31
    iput p5, p0, Ll/ۙ᩵֡;->ܳ:I

    .line 32
    iput-object p6, p0, Ll/ۙ᩵֡;->֫:Ll/ۡ᩵֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۙ᩵֡;->֫:Ll/ۡ᩵֡;

    invoke-virtual {v0, p1}, Ll/ۡ᩵֡;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۙ᩵֡;->ۧ:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۙ᩵֡;->ܽ:Ljava/util/List;

    return-object v0
.end method

.method public final ܽ()Ljava/util/Set;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۙ᩵֡;->ᩳ:Ljava/util/Set;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/ۙ᩵֡;->ܳ:I

    return v0
.end method

.method public final ᩳ()Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۙ᩵֡;->ܿ:Ljava/util/List;

    return-object v0
.end method
