.class public final Ll/᩻ܶܺ;
.super Ll/ܰ۠ܺ;
.source "R2LA"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    iput-object p1, p0, Ll/᩻ܶܺ;->᩸:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩻ܶܺ;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ll/ܳܶܺ;
    .locals 2

    .line 34
    new-instance v0, Ll/ܳܶܺ;

    iget-object v1, p0, Ll/᩻ܶܺ;->᩸:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܳܶܺ;-><init>(Ljava/util/regex/Matcher;)V

    return-object v0
.end method
