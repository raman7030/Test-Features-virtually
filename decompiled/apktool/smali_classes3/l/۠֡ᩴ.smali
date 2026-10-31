.class public final Ll/۠֡ᩴ;
.super Ljava/lang/Object;
.source "64NM"


# static fields
.field public static final ֫:[Ljava/lang/Object;

.field public static final ۧ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 90
    sput-object v1, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    new-array v0, v0, [Ljava/lang/Object;

    .line 98
    sput-object v0, Ll/۠֡ᩴ;->֫:[Ljava/lang/Object;

    return-void
.end method

.method public static ֫(II[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 114
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 115
    const-class v1, [Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    if-nez p0, :cond_0

    sget-object p0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-array p0, p0, [Ljava/lang/Object;

    goto :goto_0

    .line 116
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    :goto_0
    const/4 v0, 0x0

    .line 131
    invoke-static {p2, v0, p0, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0
.end method
