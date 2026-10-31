.class public final Ll/ܳ᩵֨;
.super Ljava/lang/Object;
.source "R450"


# instance fields
.field public ֫:Ll/ܳ᩵֨;

.field public ۧ:Ll/ܳ᩵֨;

.field public ܽ:Ll/ۤ᩵֨;

.field public ܿ:Ll/ۛ֡֨;

.field public ᩳ:Ll/ܳ᩵֨;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ll/ܳ᩵֨;Ll/ܳ᩵֨;Ll/ۤ᩵֨;)V
    .locals 0

    .line 717
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 718
    iput-object p1, p0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    .line 719
    iput-object p2, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    .line 720
    iput-object p3, p0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    .line 721
    iput-object p4, p0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-eqz p3, :cond_0

    .line 723
    iput-object p0, p3, Ll/ܳ᩵֨;->ۧ:Ll/ܳ᩵֨;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܳ᩵֨;)Ll/ܳ᩵֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܳ᩵֨;Ll/ܳ᩵֨;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܳ᩵֨;
    .locals 1

    .line 730
    iget-object v0, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    return-object v0
.end method

.method public final ֫(Ljava/util/function/Predicate;)Ll/ܳ᩵֨;
    .locals 1

    .line 734
    iget-object v0, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 735
    :cond_0
    iget-object v0, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    invoke-virtual {v0, p1}, Ll/ܳ᩵֨;->֫(Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object p1

    return-object p1

    .line 734
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/ܳ᩵֨;->ᩳ:Ll/ܳ᩵֨;

    return-object p1
.end method
