.class public final Ll/ᩴܽܺ;
.super Ljava/lang/Object;
.source "RBDN"


# instance fields
.field public final ֫:Ll/ۘܽܺ;

.field public final ۧ:Ll/᩸ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;Ll/᩸ܺܺ;Ll/ۘܽܺ;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 125
    iput-object p2, p0, Ll/ᩴܽܺ;->ۧ:Ll/᩸ܺܺ;

    .line 126
    iput-object p3, p0, Ll/ᩴܽܺ;->֫:Ll/ۘܽܺ;

    return-void

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "bootstrapMethodHandle == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 117
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "declaringClass == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ۘܽܺ;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ᩴܽܺ;->֫:Ll/ۘܽܺ;

    return-object v0
.end method

.method public final ۧ()Ll/᩸ܺܺ;
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ᩴܽܺ;->ۧ:Ll/᩸ܺܺ;

    return-object v0
.end method
