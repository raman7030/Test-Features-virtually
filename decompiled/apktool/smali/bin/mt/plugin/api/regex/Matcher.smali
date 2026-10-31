.class public interface abstract Lbin/mt/plugin/api/regex/Matcher;
.super Ljava/lang/Object;
.source "Matcher.java"


# virtual methods
.method public abstract appendReplacement(Ljava/lang/StringBuilder;Ljava/lang/String;)Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract appendTail(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
.end method

.method public abstract end()I
.end method

.method public abstract end(I)I
.end method

.method public abstract expandReplacement(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract expandReplacementInto(Ljava/lang/StringBuilder;Ljava/lang/String;)V
.end method

.method public abstract find()Z
.end method

.method public abstract find(I)Z
.end method

.method public abstract getText()Ljava/lang/CharSequence;
.end method

.method public abstract getTimeoutMillis()I
.end method

.method public abstract group()Ljava/lang/String;
.end method

.method public abstract group(I)Ljava/lang/String;
.end method

.method public abstract groupCount()I
.end method

.method public abstract hasAnchoringBounds()Z
.end method

.method public abstract hasTransparentBounds()Z
.end method

.method public abstract hitEnd()Z
.end method

.method public abstract lookingAt()Z
.end method

.method public abstract lookingAt(I)Z
.end method

.method public abstract matches()Z
.end method

.method public abstract pattern()Lbin/mt/plugin/api/regex/Pattern;
.end method

.method public abstract region(II)Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract regionEnd()I
.end method

.method public abstract regionStart()I
.end method

.method public abstract replaceAll(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract replaceFirst(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract requireEnd()Z
.end method

.method public abstract reset()Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract reset(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract setTimeoutMillis(I)Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract start()I
.end method

.method public abstract start(I)I
.end method

.method public abstract toSnapshot()Lbin/mt/plugin/api/regex/MatcherSnapshot;
.end method

.method public abstract useAnchoringBounds(Z)Lbin/mt/plugin/api/regex/Matcher;
.end method

.method public abstract useTransparentBounds(Z)Lbin/mt/plugin/api/regex/Matcher;
.end method
