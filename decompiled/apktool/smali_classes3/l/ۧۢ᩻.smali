.class public final Ll/ۧۢ᩻;
.super Ljava/lang/Object;
.source "W79N"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Ll/ۧۢ᩻;->ۧ:Ljava/lang/String;

    .line 115
    iput-object p3, p0, Ll/ۧۢ᩻;->֫:Ljava/lang/String;

    .line 117
    iput p2, p0, Ll/ۧۢ᩻;->ܽ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧۢ᩻;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۢ᩻;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧۢ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧۢ᩻;->ܽ:I

    return p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۧۢ᩻;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ۧۢ᩻;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 133
    iget v0, p0, Ll/ۧۢ᩻;->ܽ:I

    return v0
.end method
