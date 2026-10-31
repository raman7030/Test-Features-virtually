.class public final Ll/ۛۚۖ;
.super Ljava/lang/Object;
.source "P9QN"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/lang/StringBuilder;

.field public final ܽ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 658
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 651
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۛۚۖ;->ۧ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 656
    iput-boolean v0, p0, Ll/ۛۚۖ;->֫:Z

    .line 659
    iput-object p1, p0, Ll/ۛۚۖ;->ܽ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 700
    iget-object v0, p0, Ll/ۛۚۖ;->ܽ:Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/4 v0, 0x1

    .line 702
    iput-boolean v0, p0, Ll/ۛۚۖ;->֫:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 686
    iget-boolean v0, p0, Ll/ۛۚۖ;->֫:Z

    iget-object v1, p0, Ll/ۛۚۖ;->ܽ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 687
    iput-boolean v0, p0, Ll/ۛۚۖ;->֫:Z

    .line 688
    iget-object v0, p0, Ll/ۛۚۖ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 690
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 669
    iget-object v0, p0, Ll/ۛۚۖ;->ۧ:Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 674
    iget-object v0, p0, Ll/ۛۚۖ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x2

    .line 678
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void

    .line 676
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " Outdent() without matching Indent()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
