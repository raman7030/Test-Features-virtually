.class public Lorg/simpleframework/xml/stream/CamelCaseBuilder$Element;
.super Lorg/simpleframework/xml/stream/CamelCaseBuilder$Attribute;
.source "CamelCaseBuilder.java"


# instance fields
.field public capital:Z

.field public final synthetic this$0:Lorg/simpleframework/xml/stream/CamelCaseBuilder;


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/stream/CamelCaseBuilder;Ljava/lang/String;)V
    .locals 1

    .line 180
    iput-object p1, p0, Lorg/simpleframework/xml/stream/CamelCaseBuilder$Element;->this$0:Lorg/simpleframework/xml/stream/CamelCaseBuilder;

    const/4 v0, 0x0

    .line 181
    invoke-direct {p0, p1, p2, v0}, Lorg/simpleframework/xml/stream/CamelCaseBuilder$Attribute;-><init>(Lorg/simpleframework/xml/stream/CamelCaseBuilder;Ljava/lang/String;Lorg/simpleframework/xml/stream/CamelCaseBuilder$1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/simpleframework/xml/stream/CamelCaseBuilder;Ljava/lang/String;Lorg/simpleframework/xml/stream/CamelCaseBuilder$1;)V
    .locals 0

    .line 166
    invoke-direct {p0, p1, p2}, Lorg/simpleframework/xml/stream/CamelCaseBuilder$Element;-><init>(Lorg/simpleframework/xml/stream/CamelCaseBuilder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public parse([CII)V
    .locals 0

    .line 195
    iget-object p3, p0, Lorg/simpleframework/xml/stream/CamelCaseBuilder$Element;->this$0:Lorg/simpleframework/xml/stream/CamelCaseBuilder;

    iget-boolean p3, p3, Lorg/simpleframework/xml/stream/CamelCaseBuilder;->element:Z

    if-nez p3, :cond_0

    iget-boolean p3, p0, Lorg/simpleframework/xml/stream/CamelCaseBuilder$Element;->capital:Z

    if-eqz p3, :cond_1

    .line 196
    :cond_0
    aget-char p3, p1, p2

    invoke-virtual {p0, p3}, Lorg/simpleframework/xml/stream/Splitter;->toUpper(C)C

    move-result p3

    aput-char p3, p1, p2

    :cond_1
    const/4 p1, 0x1

    .line 198
    iput-boolean p1, p0, Lorg/simpleframework/xml/stream/CamelCaseBuilder$Element;->capital:Z

    return-void
.end method
