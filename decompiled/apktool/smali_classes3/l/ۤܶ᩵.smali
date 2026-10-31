.class public final Ll/ۤܶ᩵;
.super Ljava/lang/Object;
.source "VAZ3"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:[Ll/ܳ᩸᩵;


# direct methods
.method public constructor <init>([Ll/ܳ᩸᩵;)V
    .locals 0

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܶ᩵;->᩸:[Ll/ܳ᩸᩵;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 5

    .line 13472
    iget-object v0, p0, Ll/ۤܶ᩵;->᩸:[Ll/ܳ᩸᩵;

    array-length v1, v0

    sget-object v2, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 197
    invoke-interface {v2, v4}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method
