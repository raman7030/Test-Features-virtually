.class public final Ll/᩻۟᩷;
.super Ljava/lang/Object;
.source "M1KQ"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 742
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 743
    iput-object p1, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 746
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 747
    iput-object p1, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    .line 748
    iput-object p2, p0, Ll/᩻۟᩷;->֫:Ljava/lang/String;

    const/4 p1, 0x1

    .line 749
    iput-boolean p1, p0, Ll/᩻۟᩷;->ܽ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻۟᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻۟᩷;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩻۟᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩻۟᩷;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 769
    iget-object v0, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 757
    iget-object v0, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 758
    iput-object p1, p0, Ll/᩻۟᩷;->֫:Ljava/lang/String;

    const/4 p1, 0x0

    .line 759
    iput-boolean p1, p0, Ll/᩻۟᩷;->ܽ:Z

    return p1

    .line 762
    :cond_0
    iput-object p1, p0, Ll/᩻۟᩷;->֫:Ljava/lang/String;

    const/4 p1, 0x1

    .line 763
    iput-boolean p1, p0, Ll/᩻۟᩷;->ܽ:Z

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 753
    iget-boolean v0, p0, Ll/᩻۟᩷;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻۟᩷;->֫:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/᩻۟᩷;->ۧ:Ljava/lang/String;

    return-object v0
.end method
