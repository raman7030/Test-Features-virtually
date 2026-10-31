.class public final Ll/ܺۢ᩻;
.super Ljava/lang/Object;
.source "W79N"


# instance fields
.field public final ֫:[Ljava/lang/String;

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Ll/ܺۢ᩻;->ܽ:Ljava/lang/String;

    .line 92
    iput p2, p0, Ll/ܺۢ᩻;->ۧ:I

    .line 93
    invoke-virtual {p3}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ll/ܺۢ᩻;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۢ᩻;)[Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢ᩻;->֫:[Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺۢ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܺۢ᩻;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܺۢ᩻;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢ᩻;->ܽ:Ljava/lang/String;

    return-object p0
.end method
