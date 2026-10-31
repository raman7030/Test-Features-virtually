.class public abstract Ll/֡᩵ۖ;
.super Ljava/lang/Object;
.source "J9PI"


# static fields
.field public static final ֫:Ll/ᩴ᩵ۖ;

.field public static final ۧ:Ll/᩵᩵ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ll/ᩴ᩵ۖ;

    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    sput-object v0, Ll/֡᩵ۖ;->֫:Ll/ᩴ᩵ۖ;

    .line 24
    new-instance v0, Ll/᩵᩵ۖ;

    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    sput-object v0, Ll/֡᩵ۖ;->ۧ:Ll/᩵᩵ۖ;

    return-void
.end method

.method public static ֫()Ll/ᩴ᩵ۖ;
    .locals 1

    .line 33
    sget-object v0, Ll/֡᩵ۖ;->֫:Ll/ᩴ᩵ۖ;

    return-object v0
.end method

.method public static ۧ()Ll/᩵᩵ۖ;
    .locals 1

    .line 37
    sget-object v0, Ll/֡᩵ۖ;->ۧ:Ll/᩵᩵ۖ;

    return-object v0
.end method


# virtual methods
.method public abstract ֫(JLjava/lang/Object;)V
.end method

.method public abstract ֫(JLjava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract ۧ(JLjava/lang/Object;)Ljava/util/List;
.end method
