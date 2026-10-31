.class public abstract Ll/ۘܳۖ;
.super Ljava/lang/Object;
.source "H88J"


# instance fields
.field public final ֫:Ljava/lang/reflect/Field;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 438
    iput-object p1, p0, Ll/ۘܳۖ;->ܽ:Ljava/lang/String;

    .line 439
    iput-object p2, p0, Ll/ۘܳۖ;->֫:Ljava/lang/reflect/Field;

    .line 440
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘܳۖ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/ܿۜۖ;I[Ljava/lang/Object;)V
.end method

.method public abstract ֫(Ll/ܿۜۖ;Ljava/lang/Object;)V
.end method

.method public abstract ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
.end method
