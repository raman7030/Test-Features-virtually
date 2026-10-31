.class public abstract Ll/ܽ᩷֫;
.super Ljava/lang/Object;
.source "M5GJ"


# instance fields
.field public ֫:Z

.field public ۖ:Z

.field public ۘ:Ljava/util/ArrayList;

.field public ۜ:I

.field public ۡ:I

.field public ۢ:Ljava/util/ArrayList;

.field public ۧ:Z

.field public ܳ:Ljava/lang/CharSequence;

.field public ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Ljava/lang/CharSequence;

.field public ᩴ:Ljava/util/ArrayList;

.field public ᩵:I

.field public ᩷:Ljava/lang/String;

.field public ᩻:I


# virtual methods
.method public abstract ֫(Ll/۟᩸ۧ;)Ll/ܽ᩷֫;
.end method

.method public abstract ֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)Ll/ܽ᩷֫;
.end method

.method public abstract ֫(Ll/ܳۛ᩷;)Ll/ܽ᩷֫;
.end method

.method public final ֫()V
    .locals 2

    .line 728
    iget-boolean v0, p0, Ll/ܽ᩷֫;->ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 732
    iput-boolean v0, p0, Ll/ܽ᩷֫;->֫:Z

    const/4 v0, 0x0

    .line 733
    iput-object v0, p0, Ll/ܽ᩷֫;->᩷:Ljava/lang/String;

    return-void

    .line 729
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This FragmentTransaction is not allowed to be added to the back stack."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(II)V
    .locals 0

    .line 648
    iput p1, p0, Ll/ܽ᩷֫;->᩻:I

    .line 649
    iput p2, p0, Ll/ܽ᩷֫;->ۜ:I

    const/4 p1, 0x0

    .line 650
    iput p1, p0, Ll/ܽ᩷֫;->ۡ:I

    .line 651
    iput p1, p0, Ll/ܽ᩷֫;->ܺ:I

    return-void
.end method

.method public final ֫(ILl/ۡ᩻֫;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    .line 399
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    return-void

    .line 397
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must use non-zero containerViewId"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V
.end method

.method public final ֫(Ll/ۡ᩻֫;)V
    .locals 2

    .line 480
    new-instance v0, Ll/ۧ᩷֫;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Ll/ۧ᩷֫;-><init>(Ll/ۡ᩻֫;I)V

    invoke-virtual {p0, v0}, Ll/ܽ᩷֫;->֫(Ll/ۧ᩷֫;)V

    return-void
.end method

.method public final ֫(Ll/ۡ᩻֫;Ljava/lang/String;)V
    .locals 2

    const v0, 0x7f0a010f

    const/4 v1, 0x1

    .line 287
    invoke-virtual {p0, v0, p1, p2, v1}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    return-void
.end method

.method public final ֫(Ll/ۧ᩷֫;)V
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ܽ᩷֫;->ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    iget v0, p0, Ll/ܽ᩷֫;->᩻:I

    iput v0, p1, Ll/ۧ᩷֫;->ܽ:I

    .line 187
    iget v0, p0, Ll/ܽ᩷֫;->ۜ:I

    iput v0, p1, Ll/ۧ᩷֫;->ᩳ:I

    .line 188
    iget v0, p0, Ll/ܽ᩷֫;->ۡ:I

    iput v0, p1, Ll/ۧ᩷֫;->ۜ:I

    .line 189
    iget v0, p0, Ll/ܽ᩷֫;->ܺ:I

    iput v0, p1, Ll/ۧ᩷֫;->᩷:I

    return-void
.end method

.method public final ֫(Ll/᩸᩸ۧ;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v2, 0x7f0a044c

    .line 242
    invoke-virtual {p0, v2, p1, v0, v1}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    return-void
.end method

.method public abstract ۧ()I
.end method

.method public abstract ۧ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;
.end method

.method public abstract ۧ(Ll/ܳۛ᩷;)Ll/ܽ᩷֫;
.end method

.method public final ܳ()V
    .locals 1

    const/16 v0, 0x1003

    .line 699
    iput v0, p0, Ll/ܽ᩷֫;->᩵:I

    return-void
.end method

.method public abstract ܽ()I
.end method

.method public abstract ܽ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 855
    iput-boolean v0, p0, Ll/ܽ᩷֫;->ۖ:Z

    return-void
.end method

.method public abstract ᩳ()V
.end method
