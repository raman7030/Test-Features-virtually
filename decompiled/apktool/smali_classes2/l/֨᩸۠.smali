.class public Ll/֨᩸۠;
.super Ljava/lang/Object;
.source "143X"


# instance fields
.field public ֫:Ljava/util/EnumSet;

.field public ۧ:Ll/ۗ۠۠;

.field public ܽ:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 84
    invoke-direct {p0, v0}, Ll/֨᩸۠;-><init>(Ll/ۗ۠۠;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗ۠۠;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Ll/֨᩸۠;->ۧ:Ll/ۗ۠۠;

    .line 45
    const-class v0, Ll/᩶ᩴ֨;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    iput-object v1, p0, Ll/֨᩸۠;->֫:Ljava/util/EnumSet;

    .line 46
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/֨᩸۠;->ܽ:Ljava/util/EnumSet;

    .line 61
    iput-object p1, p0, Ll/֨᩸۠;->ۧ:Ll/ۗ۠۠;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 78
    iget-object v0, p0, Ll/֨᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 79
    iget-object v0, p0, Ll/֨᩸۠;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public final ֫(Ll/᩶ᩴ֨;)Z
    .locals 1

    .line 65
    iget-object v0, p0, Ll/֨᩸۠;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    iget-object v0, p0, Ll/֨᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()Ll/ۗ۠۠;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/֨᩸۠;->ۧ:Ll/ۗ۠۠;

    return-object v0
.end method

.method public final ۧ(Ll/᩶ᩴ֨;)Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/֨᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܽ(Ll/᩶ᩴ֨;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/֨᩸۠;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ᩳ(Ll/᩶ᩴ֨;)V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/֨᩸۠;->֫:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method
