.class public final Ll/۫ۘܽ;
.super Ljava/lang/Object;
.source "UAYU"

# interfaces
.implements Lbin/mt/plugin/api/regex/Matcher;
.implements Ll/᩺ۘܽ;


# instance fields
.field public final ֫:Ll/۠۠ܽ;


# direct methods
.method public constructor <init>(Ll/ۨۘܽ;Ljava/lang/CharSequence;)V
    .locals 2

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Ll/۠۠ܽ;

    invoke-virtual {p1}, Ll/ۨۘܽ;->֫()Ll/֫֡ܽ;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Ll/۠۠ܽ;-><init>(Ll/ۨۘܽ;Ll/֫֡ܽ;Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    return-void
.end method


# virtual methods
.method public final appendReplacement(Ljava/lang/StringBuilder;Ljava/lang/String;)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 648
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1, p2}, Ll/۠۠ܽ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-object p0
.end method

.method public final appendTail(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 666
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public final end()I
    .locals 1

    .line 293
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final end(I)I
    .locals 1

    .line 316
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->end(I)I

    move-result p1

    return p1
.end method

.method public final expandReplacement(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 443
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    invoke-static {v0, v1, p1}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 435
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final expandReplacementInto(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    .line 448
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    invoke-static {v0, p1, p2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public final find()Z
    .locals 1

    .line 490
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final find(I)Z
    .locals 1

    .line 512
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ۧ(I)Z

    move-result p1

    return p1
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 194
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTimeoutMillis()I
    .locals 1

    .line 1007
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->᩷()I

    move-result v0

    return v0
.end method

.method public final group()Ljava/lang/String;
    .locals 2

    .line 359
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    const/4 v1, 0x0

    .line 408
    invoke-virtual {v0, v1}, Ll/۠۠ܽ;->group(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final group(I)Ljava/lang/String;
    .locals 1

    .line 396
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->group(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final groupCount()I
    .locals 1

    .line 438
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->groupCount()I

    move-result v0

    return v0
.end method

.method public final hasAnchoringBounds()Z
    .locals 1

    .line 896
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۢ()Z

    move-result v0

    return v0
.end method

.method public final hasTransparentBounds()Z
    .locals 1

    .line 843
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۘ()Z

    move-result v0

    return v0
.end method

.method public final hitEnd()Z
    .locals 1

    .line 952
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ᩴ()Z

    move-result v0

    return v0
.end method

.method public final lookingAt()Z
    .locals 1

    .line 531
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->᩵()Z

    move-result v0

    return v0
.end method

.method public final lookingAt(I)Z
    .locals 1

    .line 539
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܽ(I)Z

    move-result p1

    return p1
.end method

.method public final matches()Z
    .locals 1

    .line 462
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->֡()Z

    move-result v0

    return v0
.end method

.method public final pattern()Lbin/mt/plugin/api/regex/Pattern;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v0

    return-object v0
.end method

.method public final pattern()Ll/ۨۘܽ;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v0

    return-object v0
.end method

.method public final region(II)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 794
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1, p2}, Ll/۠۠ܽ;->ۧ(II)V

    return-object p0
.end method

.method public final region(II)V
    .locals 1

    .line 794
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1, p2}, Ll/۠۠ܽ;->ۧ(II)V

    return-void
.end method

.method public final regionEnd()I
    .locals 1

    .line 821
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->۠()I

    move-result v0

    return v0
.end method

.method public final regionStart()I
    .locals 1

    .line 808
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ܶ()I

    move-result v0

    return v0
.end method

.method public final replaceAll(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 703
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final replaceFirst(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 768
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final requireEnd()Z
    .locals 1

    .line 971
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->᩸()Z

    move-result v0

    return v0
.end method

.method public final reset()Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->᩹()V

    return-object p0
.end method

.method public final reset(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 227
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public final reset(Ljava/lang/CharSequence;)V
    .locals 1

    .line 227
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTimeoutMillis(I)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 976
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܿ(I)V

    return-object p0
.end method

.method public final setTimeoutMillis(I)V
    .locals 1

    .line 976
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܿ(I)V

    return-void
.end method

.method public final start()I
    .locals 1

    .line 239
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->۬()I

    move-result v0

    return v0
.end method

.method public final start(I)I
    .locals 1

    .line 262
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->start(I)I

    move-result p1

    return p1
.end method

.method public final toSnapshot()Lbin/mt/plugin/api/regex/MatcherSnapshot;
    .locals 1

    .line 544
    new-instance v0, Ll/ۤۘܽ;

    invoke-direct {v0, p0}, Ll/ۤۘܽ;-><init>(Ll/۫ۘܽ;)V

    return-object v0
.end method

.method public final toSnapshot()Ll/ۤۘܽ;
    .locals 1

    .line 544
    new-instance v0, Ll/ۤۘܽ;

    invoke-direct {v0, p0}, Ll/ۤۘܽ;-><init>(Ll/۫ۘܽ;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 936
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final useAnchoringBounds(Z)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 922
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ۧ(Z)V

    return-object p0
.end method

.method public final useTransparentBounds(Z)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 874
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܽ(Z)V

    return-object p0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 421
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 1002
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->֫()V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 147
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1, p2}, Ll/۠۠ܽ;->֫(J)V

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 991
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Ll/ۨۘܽ;)V
    .locals 2

    .line 188
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {p1}, Ll/ۨۘܽ;->֫()Ll/֫֡ܽ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/۠۠ܽ;->֫(Ll/ۨۘܽ;Ll/֫֡ܽ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 1067
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->֫(Z)V

    return-void
.end method

.method public final ֫(I)Z
    .locals 1

    .line 1041
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final ۜ()Z
    .locals 1

    .line 1014
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۖ()Z

    move-result v0

    return v0
.end method

.method public final ۡ()V
    .locals 1

    .line 982
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۗ()V

    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 1033
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۙ()V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)I
    .locals 1

    .line 281
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0, p1}, Ll/۠۠ܽ;->ܿ(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/lang/Runnable;
    .locals 1

    .line 997
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ܿ()Ljava/lang/Runnable;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 1024
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۡ()Z

    move-result v0

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 142
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Ljava/util/ArrayList;
    .locals 1

    .line 1078
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ۜ()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 137
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->᩻()I

    move-result v0

    return v0
.end method

.method public final ᩷()V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->᩶()V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 1019
    iget-object v0, p0, Ll/۫ۘܽ;->֫:Ll/۠۠ܽ;

    invoke-virtual {v0}, Ll/۠۠ܽ;->ܺ()Z

    move-result v0

    return v0
.end method
